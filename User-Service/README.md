# User Service

## 🚀 Introduction
The User Service is a microservice responsible for managing user information. It provides APIs for creating, retrieving, updating, and deleting user details.


## 🔗 API Endpoints

### 👤 Create User
- **URL:** `/users`
- **Method:** `POST`
- **Description:** Creates a new user.
- **Request Body:**
    ```json
    {
        "username": "string",
        "password": "string",
        "email": "string"
    }
    ```
- **Response:**
    ```json
    {
        "userId": "string",
        "username": "string",
        "email": "string",
        "createdDate": "string"
    }
    ```

### 🔍 Get User Details
- **URL:** `/users/{userId}`
- **Method:** `GET`
- **Description:** Retrieves user details by user ID.
- **Response:**
    ```json
    {
        "userId": "string",
        "username": "string",
        "email": "string",
        "createdDate": "string"
    }
    ```

### 🗑️ Delete User
- **URL:** `/users/{userId}`
- **Method:** `DELETE`
- **Description:** Deletes a user by user ID.
- **Response:** `204 No Content`

### 🔄 Update User
- **URL:** `/users/{userId}`
- **Method:** `PUT`
- **Description:** Updates user details.
- **Request Body:**
    ```json
    {
        "username": "string",
        "email": "string"
    }
    ```
- **Response:**
    ```json
    {
        "userId": "string",
        "username": "string",
        "email": "string",
        "updatedDate": "string"
    }
    ```

### 📋 List Users
- **URL:** `/users`
- **Method:** `GET`
- **Description:** Retrieves a list of all users.
- **Response:**
    ```json
    [
        {
            "userId": "string",
            "username": "string",
            "email": "string",
            "createdDate": "string"
        }
    ]
    ```
