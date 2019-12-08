## Domain -> C3

### Metamodel
To represent a DDD model various changes were introduced. The first change was the SubEntity class and it's relations. In a perfect DDD model the "SubEntity" concept is inexistant and the concept in itself is ambiguous. So ValueObject was introduced as well the Reference class was changed, so an Entity can have a Reference to another Entity or to a Value Object. The Entity can also be a root of an aggregate, so an attribute was inserted. 

There were two options for a Reference, either the Reference joined two related Entities or an Entity had a Reference to another Entity. Although both are correct, it seemed correct and favorable to use the latter, because it would serve to create a Reference to a Value Object too. 

The Domain has all Entities and Value Objects available. This decision occurred after a observation of a Domain Model. In fact all Entities and Value Objects belong to the Domain Model and all Value Objects can be used by the Entities. To restrict the usage of the Value Objects there are validations to ensure the consistency of the Domain Model.
