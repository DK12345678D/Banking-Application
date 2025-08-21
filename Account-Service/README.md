# Account Service
## 🚀 Introduction
The Account Service is a microservice responsible for managing bank accounts. It provides APIs for creating, retrieving, updating, and deleting accounts.


## 🔗 API Endpoints

### 🏦 Create Account
- **URL:** `/accounts`
- **Method:** `POST`
- **Description:** Creates a new account.
- **Request Body:**
    ```json
    {
        "customerId": "string",
        "accountType": "string",
        "initialDeposit": "number"
    }
    ```
- **Response:**
    ```json
    {
        "accountId": "string",
        "customerId": "string",
        "accountType": "string",
        "balance": "number",
        "createdDate": "string"
    }
    ```

### 🔍 Get Account Details
- **URL:** `/accounts/{accountId}`
- **Method:** `GET`
- **Description:** Retrieves account details by account ID.
- **Response:**
    ```json
    {
        "accountId": "string",
        "customerId": "string",
        "accountType": "string",
        "balance": "number",
        "createdDate": "string"
    }
    ```

### 🗑️ Delete Account
- **URL:** `/accounts/{accountId}`
- **Method:** `DELETE`
- **Description:** Deletes an account by account ID.
- **Response:** `204 No Content`

### 🔄 Update Account
- **URL:** `/accounts/{accountId}`
- **Method:** `PUT`
- **Description:** Updates account details.
- **Request Body:**
    ```json
    {
        "accountType": "string",
        "balance": "number"
    }
    ```
- **Response:**
    ```json
    {
        "accountId": "string",
        "customerId": "string",
        "accountType": "string",
        "balance": "number",
        "updatedDate": "string"
    }
    ```

### 📋 List Accounts
- **URL:** `/accounts`
- **Method:** `GET`
- **Description:** Retrieves a list of all accounts.
- **Response:**
    ```json
    [
        {
            "accountId": "string",
            "customerId": "string",
            "accountType": "string",
            "balance": "number",
            "createdDate": "string"
        }
    ]
    ```
