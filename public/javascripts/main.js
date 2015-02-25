function onLoadCallback()
{
    gapi.client.setApiKey('AIzaSyDt66B4MPWeSNQjQxBJVQYNcA_FtJy7aL4'); //set your API KEY
    gapi.client.load('plus', 'v1',function(){});//Load Google + API
}

function login() 
{
  var myParams = {
    'clientid' : '217424239173-75719ljeaia9c2mpr27mtlv4trhebs2i.apps.googleusercontent.com', //You need to set client id
    'cookiepolicy' : 'single_host_origin',
    'callback' : 'loginCallback', //callback function
    'approvalprompt':'force',
    'scope' : 'https://www.googleapis.com/auth/plus.login https://www.googleapis.com/auth/plus.profile.emails.read',
  };
  gapi.auth.signIn(myParams);
  console.log('myparams');
console.log(myParams);
}

  function loginCallback(result)
	{	
		var send_email = '';
		var full_name = '';
		console.log('Result');
		console.log(result);
	    if(result['status']['signed_in'])
	    { 
	        alert("Login Success");
	        var request = gapi.client.plus.people.get({
			    'userId': 'me'
			});
			console.log('request');
			console.log(request);
			request.execute(function (resp)
			{
			    var email = '';
			    if(resp['emails'])
			    {
			        for(i = 0; i < resp['emails'].length; i++)
			        {
			            if(resp['emails'][i]['type'] == 'account')
			            {
			                email = resp['emails'][i]['value'];
			            }
			        }
			    }
			 	send_email = email;
			 	full_name = resp['displayName'];
			    jQuery.ajax({
			        type: 'POST',
			        url: '/signup',
			        data: {email : send_email, fullname : full_name},
			        dataType: 'JSON',
			        success: function(result) {
			        	if(result.status_code == 200)
			        	{
			        		window.location.href="/dashboard";
			        	}
			        	else if(result.status_code == 401)
		                {
		                    window.location.href="/login";
		                }
			        	else
			        	{
			        		alert(result.data.Reason);
			        	}
			        }
		    	}); 
			    // var str = "Name:" + resp['displayName'] + "<br>";
			    // str += "Image:" + resp['image']['url'] + "<br>";
			    // str += "<img src='" + resp['image']['url'] + "' /><br>";
			 
			    // str += "URL:" + resp['url'] + "<br>";
			    // str += "Email:" + email + "<br>";
			    // document.getElementById("profile").innerHTML = str;
			});	
	    }  	 
	}

function logout()
{
    gapi.auth.signOut();
    location.reload();
}

jQuery(document).ready(function(){
	$("form#signIn").validate({
    
        // Specify the validation rules
        rules: {
            email: {
                required: true,
                email: true
            },
            password: {
                required: true,
                minlength: 5
            }
        },
        
        // Specify the validation error messages
        messages: {
            password: {
                required: "Please provide a password",
                minlength: "Your password must be at least 5 characters long"
            },
            email: "Please enter a valid email address"
        },
        
        // submitHandler: function(form) {
        //     form.submit();
        // }
    });
    $("form#signUp").validate({
    
        // Specify the validation rules
        rules: {
            full_name: "required",
            newemail: {
                required: true,
                email: true
            },
            newpassword: {
                required: true,
                minlength: 5
            },
            conf_pass: {
                equalTo: "#newpassword",
                minlength: 5
            }
        },
        
        // Specify the validation error messages
        messages: {
            full_name: "Please enter your name",
            newemail: "Please enter a valid email address",
            newpassword: {
                required: "Please provide a password",
                minlength: "Your password must be at least 5 characters long"
            },
            conf_pass: {
                required: "Please retype password",
                minlength: "Your password does not match"
            }
            
        },
        
        // submitHandler: function(form) {
        //     form.submit();
        // }
    });

	jQuery('form#signIn').submit(function(){
		var b = $("form#signIn").valid();
        if(!(b)) {
            return false;
        }
        var email = $('#email').val();
		var pass = $('#password').val();
	    // var srt = jQuery("#" + jQuery(this).attr("id")).serialize();
    	jQuery.ajax({
	        type: 'POST',
	        url: '/login',
	        data: {'email': email,'password':pass},
	        dataType: 'JSON',
	        success: function(result) {
	        	if(result.status_code == 200)
	        	{
	        		window.location.href="/dashboard";
	        	}
	        	else if(result.status_code == 401)
                {
                    window.location.href="/login";
                }
	        	else
	        	{
	        		alert(result.data.Reason);
	        	}
	        }
    	});
 	});

	$("form#signUp").submit(function(e){
		e.preventDefault();
		var b = $("form#signUp").valid();
		if(!(b)) {
            return false;
        }


		console.log('clicked');
		
		var fullname = $('#fullname').val();
		var email = $('#newemail').val();
		var pass = $('#newpassword').val();
		var conf_pass = $('#conf_pass').val();
			console.log('checking if pass');
			// var formData = new FormData($(this)[0]);
		    // var srt = jQuery("#" + jQuery(this).attr("id")).serialize();
//		    jQuery.ajax({
//		        url: '/signup',
//		        type: 'POST',
//		        data: {'fullname':fullname,'email': email,'password':pass},
//		        success: function (result) {
//		        	console.log(result);
//		           if(result.status_code == 200)
//		        	{
//		        		window.location.href="/dashboard";
//		        	}
//		        	else if(result.status_code == 401)
//	                {
//	                    window.location.href="/login";
//	                }
//		        	else
//		        	{
//		        		alert(result.data.Reason);
//		        	}
//		        }
//		    });
			$.post('/signup',
				      {'name':'aasamiraa','email':'sam111.sunny001@gmail.com','password':'sam'},
				      function(data) {
				          window.alert(data);
			});
	});
	    
});

	 
