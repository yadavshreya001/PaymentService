# 🚀 Payment Service

## 📝 Overview

The **Payment Service** is a Spring Boot-based microservice that provides a payment gateway integration with **Razorpay** and **Stripe**. This service allows generating payment links for orders, making it easier to facilitate online payments.

## ✨ Features

- 🔗 Generate payment links using Razorpay.
- 💳 Generate payment links using Stripe.
- 📩 Webhook support for handling payment notifications.
- 🔧 Configurable API keys for different payment gateways.

## 🛠 Tech Stack

- **☕ Java 17**
- **🚀 Spring Boot**
- **🌐 Spring Web**
- **💰 Razorpay SDK**
- **💵 Stripe SDK**
- **📦 Lombok**

## 📥 Installation & Setup

### ✅ Prerequisites

- ☕ Java 17+
- 🛠 Maven
- 🔑 Razorpay/Stripe account with API keys

### 📂 Clone the Repository

```sh
git clone https://github.com/your-repo/payment-service.git
cd payment-service
```

### 🔧 Configure Environment Variables

Create an `application.properties` file in `src/main/resources/` and add the following properties:

```properties
razorpay.key.id=your_razorpay_key_id
razorpay.key.secret=your_razorpay_key_secret
stripe.api.key=your_stripe_api_key
```

### 🔨 Build and Run

```sh
mvn clean install
mvn spring-boot:run
```

## 📡 API Endpoints

### 🔗 Generate Payment Link

**POST** `/payments`

#### 📤 Request Body:

```json
{
  "orderId": 123456
}
```

#### 📥 Response:

Returns a payment link URL.

### 📩 Webhook Endpoint

**POST** `/payments/webhook`
This endpoint handles payment gateway webhook notifications.

## 📂 Project Structure

```
com.paymentservice
│── configs            # 🛠 Configuration classes
│── controllers        # 🎮 API controllers
│── dtos               # 📦 Data transfer objects
│── services           # ⚙️ Service interfaces and implementations
│── PaymentServiceApplication.java  # 🚀 Main Spring Boot application
```
