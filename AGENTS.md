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

<!-- nx configuration start-->
<!-- Leave the start & end comments to automatically receive updates. -->

# General Guidelines for working with Nx

- For navigating/exploring the workspace, invoke the `nx-workspace` skill first - it has patterns for querying projects, targets, and dependencies
- When running tasks (for example build, lint, test, e2e, etc.), always prefer running the task through `nx` (i.e. `nx run`, `nx run-many`, `nx affected`) instead of using the underlying tooling directly
- Prefix nx commands with the workspace's package manager (e.g., `pnpm nx build`, `npm exec nx test`) - avoids using globally installed CLI
- You have access to the Nx MCP server and its tools, use them to help the user
- For Nx plugin best practices, check `node_modules/@nx/<plugin>/PLUGIN.md`. Not all plugins have this file - proceed without it if unavailable.
- NEVER guess CLI flags - always check nx_docs or `--help` first when unsure

## Scaffolding & Generators

- For scaffolding tasks (creating apps, libs, project structure, setup), ALWAYS invoke the `nx-generate` skill FIRST before exploring or calling MCP tools

## When to use nx_docs

- USE for: advanced config options, unfamiliar flags, migration guides, plugin configuration, edge cases
- DON'T USE for: basic generator syntax (`nx g @nx/react:app`), standard commands, things you already know
- The `nx-generate` skill handles generator discovery internally - don't call nx_docs just to look up generator syntax


<!-- nx configuration end-->