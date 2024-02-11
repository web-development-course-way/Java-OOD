# Overview
The idea is to apply different design patterns on a prototype of Online Auction platform. It will not be for sure a real one but a simulation of code design and hence we are using the "println" instead of real function
## Services and Design Patterns
The platform as a start will have 4 services implemented with 4 different patterns
### Services:
- **User management**: Create different user roles (buyers, sellers, admins) with distinct functionalities and access levels.
- **Product listings**: Allow sellers to create product listings with diverse attributes (category, description, price, bidding options).
- **Bidding and buying**: Manage the bidding process (open, closed, time-based, reserve price), handle automatic and manual bids, and facilitate secure transactions.
- **Payment processing**: Integrate with different payment gateways to offer flexibility and security for transactions.
### Design Patterns Used
- **Factory** for User Management
- **Decorator** for Product Listings
- **Startegy** for Bidding and Buying
- **Singleton** for Payment Processing
