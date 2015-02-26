package models;

public enum TypeToken {
	password("reset"), email("email");
    String urlPath;

    TypeToken(String urlPath) {
        this.urlPath = urlPath;
    }
}
