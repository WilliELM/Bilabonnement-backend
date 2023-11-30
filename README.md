##Bilabonnement API Documentation

The Bilabonnement API provides endpoints to manage information related to cars, customers, damage reports, and subscriptions. It allows you to perform CRUD operations (Create, Read, Update, Delete) on these entities.


####Car Endpoints

#####1. Get All Cars
Endpoint: GET /cars
Description: Retrieve a list of all cars.
Response: List of Car objects.

#####2. Get Car by ID
Endpoint: GET /cars/{id}
Description: Retrieve details of a specific car by providing its ID.
Parameters:
id (Path Variable): ID of the car.
Response: Car object.

#####3. Create Car
Endpoint: POST /cars
Description: Create a new car.
Request Body: Car object.
Response: Created Car object.

#####4. Update Car
Endpoint: PUT /cars/{id}
Description: Update details of a specific car by providing its ID.
Parameters:
id (Path Variable): ID of the car.
Request Body: Updated Car object.
Response: Updated Car object.

#####5. Delete Car
Endpoint: DELETE /cars/{id}
Description: Delete a specific car by providing its ID.
Parameters:
id (Path Variable): ID of the car.
Response: No content.

####Customer Endpoints

#####1. Get All Customers
Endpoint: GET /customers
Description: Retrieve a list of all customers.
Response: List of Customer objects.

#####2. Get Customer by ID
Endpoint: GET /customers/{id}
Description: Retrieve details of a specific customer by providing their ID.
Parameters:
id (Path Variable): ID of the customer.
Response: Customer object.

#####3. Create Customer
Endpoint: POST /customers
Description: Create a new customer.
Request Body: Customer object.
Response: Created Customer object.

#####4. Update Customer
Endpoint: PUT /customers/{id}
Description: Update details of a specific customer by providing their ID.
Parameters:
id (Path Variable): ID of the customer.
Request Body: Updated Customer object.
Response: Updated Customer object.

#####5. Delete Customer
Endpoint: DELETE /customers/{id}
Description: Delete a specific customer by providing their ID.
Parameters:
id (Path Variable): ID of the customer.
Response: No content.

####Damage Report Endpoints

#####1. Get All Damage Reports
Endpoint: GET /damagereports
Description: Retrieve a list of all damage reports.
Response: List of DamageReport objects.

#####2. Get Damage Report by ID
Endpoint: GET /damagereports/{id}
Description: Retrieve details of a specific damage report by providing its ID.
Parameters:
id (Path Variable): ID of the damage report.
Response: DamageReport object.

#####3. Create Damage Report
Endpoint: POST /damagereports
Description: Create a new damage report.
Request Body: DamageReport object.
Response: Created DamageReport object.

#####4. Update Damage Report
Endpoint: PUT /damagereports/{id}
Description: Update details of a specific damage report by providing its ID.
Parameters:
id (Path Variable): ID of the damage report.
Request Body: Updated DamageReport object.
Response: Updated DamageReport object.

#####5. Delete Damage Report
Endpoint: DELETE /damagereports/{id}
Description: Delete a specific damage report by providing its ID.
Parameters:
id (Path Variable): ID of the damage report.
Response: No content.

####Subscription Endpoints

#####1. Get All Subscriptions
Endpoint: GET /subscriptions
Description: Retrieve a list of all subscriptions.
Response: List of Subscription objects.

#####2. Get Subscription by ID
Endpoint: GET /subscriptions/{id}
Description: Retrieve details of a specific subscription by providing its ID.
Parameters:
id (Path Variable): ID of the subscription.
Response: Subscription object.

#####3. Create Subscription
Endpoint: POST /subscriptions
Description: Create a new subscription.
Request Body: Subscription object.
Response: Created Subscription object.

#####4. Update Subscription
Endpoint: PUT /subscriptions/{id}
Description: Update details of a specific subscription by providing its ID.
Parameters:
id (Path Variable): ID of the subscription.
Request Body: Updated Subscription object.
Response: Updated Subscription object.

#####5. Delete Subscription
Endpoint: DELETE /subscriptions/{id}
Description: Delete a specific subscription by providing its ID.
Parameters:
id (Path Variable): ID of the subscription.
Response: No content.

####Error Handling
In case of an error, the API will return an appropriate HTTP status code along with a JSON response containing details about the error.
