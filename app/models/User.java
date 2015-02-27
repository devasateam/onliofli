package models;

import models.account.utils.AppException;
import models.account.utils.Hash;
import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.ObjectId;

import org.apache.commons.lang3.StringUtils;

import play.data.validation.Constraints.Required;
import play.modules.mongodb.jackson.MongoDB;

import com.mongodb.BasicDBObject;

/**
 * The Class User.
 */
public class User {

	@Id
	@ObjectId
	public String id;

	@Required
	public String email;

	@Required
	public String fullname;

	@Required
	public String confirmationToken;

	@Required
	public String passwordHash;

	public boolean validated;

	public static JacksonDBCollection<User, String> userCollection = MongoDB
			.getCollection("User", User.class, String.class);

	public User() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getConfirmationToken() {
		return confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}


	/**
	 * Retrieve a user from a fullname.
	 * 
	 * @param fullname
	 *            Full name
	 * @return a user
	 */
	public static User findByFullname(String fullname) {
		return User.userCollection.findOne(new BasicDBObject().append(
				"fullname", fullname));
	}

	/**
	 * Retrieves a user from a confirmation token.
	 * 
	 * @param token
	 *            the confirmation token to use.
	 * @return a user if the confirmation token is found, null otherwise.
	 */
	public static User findByConfirmationToken(String token) {
		return User.userCollection.findOne(new BasicDBObject().append("confirmationToken",
				token));
	}

	/**
	 * Find by email.
	 * 
	 * @param email
	 *            the email
	 * @return the user
	 */
	public static User findByEmail(String email) {
		return User.userCollection.findOne(new BasicDBObject().append("email",
				email));
	}

	/**
	 * Find by id.
	 * 
	 * @param email
	 *            the email
	 * @return the user
	 */
	public static User findById(String id) {
		return User.userCollection
				.findOne(new BasicDBObject().append("id", id));
	}

	/**
	 * Authenticate a User, from a email and clear password.
	 * 
	 * @param email
	 *            email
	 * @param clearPassword
	 *            clear password
	 * @return User if authenticated, null otherwise
	 */
	public static User authenticate(String email, String clearPassword) {

		// get the user with email only to keep the salt password
		User user = findByEmail(email);
		if (user != null) {
			// get the hash password from the salt + clear password
			if (Hash.checkPassword(clearPassword, user.passwordHash)) {
				return user;
			}
		}
		return null;
	}

	/**
	 * Change password.
	 * 
	 * @param password
	 *            the password
	 * @throws AppException
	 *             the app exception
	 */
	public void changePassword(String password) throws AppException {
		this.passwordHash = Hash.createPassword(password);
	}

	/**
	 * Confirms an account.
	 * 
	 * @param user
	 *            the user
	 * @return true if confirmed, false otherwise.
	 * @throws AppException
	 *             App Exception
	 */
	public static boolean confirm(User user) throws AppException {
		if (user == null) {
			return false;
		}

		user.confirmationToken = null;
		user.validated = true;
		User.userCollection.save(user);
		return true;
	}

	/**
	 * Checks if is registered.
	 * 
	 * @param email
	 *            the email
	 * @return true, if is registered
	 */
	private static boolean isRegistered(String email) {
		User user = User.findByEmail(email);
		if (user != null) {
			return true;
		}

		return false;
	}

	/**
	 * Creates the.
	 * 
	 * @param user
	 *            the user
	 * @return true, if successful
	 */
	public static boolean create(User user) {
		if (user != null && !StringUtils.isEmpty(user.email)
				&& !isRegistered(user.email)) {
			User.userCollection.save(user);
			return true;
		}
		return false;

	}

	/**
	 * Update.
	 * 
	 * @param user
	 *            the user
	 */
	public static void update(User user) {
		if (user != null && !StringUtils.isEmpty(user.id))
			User.userCollection.updateById(user.id, user);
	}

}
