<!-- BEGIN:java-backend-agent-rules -->
# This is NOT the Java Backend you know

This version uses Java 20 (Temurin) and the Spring ecosystem. All microservices must be designed with modern Java features (Records, Sealed Classes, Pattern Matching). Heed deprecation notices in Spring Boot 3+.
<!-- END:java-backend-agent-rules -->

<!-- BEGIN:project-context -->
# Project Context & Business Logic

This is the **Backend (Microservices)** for a Social Network Application. All AI agents MUST adhere to the following core concepts when designing services, APIs, or database schemas:

1. **System Architecture:**
   - **Microservices:** The backend is composed of multiple microservices using **Spring Cloud**.
   - **Service Patterns:** Services can follow either **Clean Architecture** (Domain-centric) or **Layered Architecture** (Controller-Service-Repository).
   - **Communication:** Use **Kafka** for all asynchronous, event-driven communications between services.
   - **Persistence:** Use **MongoDB** for document storage or **GraphQL** as the data access/query layer where applicable.
   - **Authentication:** All authentication and authorization are handled via **Keycloak**.

2. **Access Control & Business Logic (CRITICAL):**
   - The application implements strict **gender-based access control**.
   - **Female Users:** Full, unrestricted access to all API endpoints and features.
   - **Male Users:** Heavily restricted. "Read-only" access to limited public information.
   - **Backend Enforcement:** The backend MUST be the final authority on these restrictions. Every sensitive endpoint must verify the user's gender (claims from Keycloak) before processing.

3. **Design Aesthetics Support:**
   - Ensure APIs provide the necessary metadata to support the feminine, high-end UI theme (soft pinks, glassmorphism) on the frontend.
<!-- END:project-context -->
