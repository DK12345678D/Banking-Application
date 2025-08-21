# Fund Transfer Service

## 🚀 Introduction
The Fund Transfer Service is a microservice responsible for handling fund transfers between bank accounts. It provides APIs for initiating, processing, and tracking fund transfers.

## 🔗 API Endpoints

### 💸 Initiate Transfer
- **URL:** `/transfers`
- **Method:** `POST`
- **Description:** Initiates a new fund transfer.
- **Request Body:**
    ```json
    {
        "fromAccountId": "string",
        "toAccountId": "string",
        "amount": "number"
    }
    ```
- **Response:**
    ```json
    {
        "transferId": "string",
        "fromAccountId": "string",
        "toAccountId": "string",
        "amount": "number",
        "status": "string",
        "createdDate": "string"
    }
    ```

### 🔍 Get Transfer Details
- **URL:** `/transfers/{transferId}`
- **Method:** `GET`
- **Description:** Retrieves transfer details by transfer ID.
- **Response:**
    ```json
    {
        "transferId": "string",
        "fromAccountId": "string",
        "toAccountId": "string",
        "amount": "number",
        "status": "string",
        "createdDate": "string"
    }
    ```

### 📋 List Transfers
- **URL:** `/transfers`
- **Method:** `GET`
- **Description:** Retrieves a list of all transfers.
- **Response:**
    ```json
    [
        {
            "transferId": "string",
            "fromAccountId": "string",
            "toAccountId": "string",
            "amount": "number",
            "status": "string",
            "createdDate": "string"
        }
    ]
    ```
