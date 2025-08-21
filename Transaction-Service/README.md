# Transaction Service

## 🚀 Introduction
The Transaction Service is a microservice responsible for managing bank transactions. It provides APIs for creating, retrieving, and listing transactions.
## 🔗 API Endpoints

### 💸 Create Transaction
- **URL:** `/transactions`
- **Method:** `POST`
- **Description:** Creates a new transaction.
- **Request Body:**
    ```json
    {
        "accountId": "string",
        "amount": "number",
        "transactionType": "string"
    }
    ```
- **Response:**
    ```json
    {
        "transactionId": "string",
        "accountId": "string",
        "amount": "number",
        "transactionType": "string",
        "transactionDate": "string"
    }
    ```

### 🔍 Get Transaction Details
- **URL:** `/transactions/{transactionId}`
- **Method:** `GET`
- **Description:** Retrieves transaction details by transaction ID.
- **Response:**
    ```json
    {
        "transactionId": "string",
        "accountId": "string",
        "amount": "number",
        "transactionType": "string",
        "transactionDate": "string"
    }
    ```

### 📋 List Transactions
- **URL:** `/transactions`
- **Method:** `GET`
- **Description:** Retrieves a list of all transactions.
- **Response:**
    ```json
    [
        {
            "transactionId": "string",
            "accountId": "string",
            "amount": "number",
            "transactionType": "string",
            "transactionDate": "string"
        }
    ]
    ```
