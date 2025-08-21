# Sequence Generator Service

## 🚀 Introduction
The Sequence Generator Service is a microservice responsible for generating unique sequences for various entities. It provides APIs for generating and retrieving sequences.


## 🔗 API Endpoints

### 🔢 Generate Sequence
- **URL:** `/sequences`
- **Method:** `POST`
- **Description:** Generates a new sequence.
- **Request Body:**
    ```json
    {
        "entityName": "string"
    }
    ```
- **Response:**
    ```json
    {
        "entityName": "string",
        "sequenceValue": "number"
    }
    ```

### 🔍 Get Sequence
- **URL:** `/sequences/{entityName}`
- **Method:** `GET`
- **Description:** Retrieves the current sequence value for the specified entity.
- **Response:**
    ```json
    {
        "entityName": "string",
        "sequenceValue": "number"
    }
    ```


