## Domain -> C3

### Metamodel
To represent a DDD model various changes were introduced. The first change was the SubEntity class and it's relations. In a perfect DDD model the "SubEntity" concept is inexistant and the concept in itself is ambiguous. So ValueObject was introduced as well the Reference class was changed, so an Entity can have a Reference to another Entity or to a Value Object. The Entity can also be a root of an aggregate, so an attribute was inserted. 

There were two options for a Reference, either the Reference joined two related Entities or an Entity had a Reference to another Entity. Although both are correct, it seemed correct and favorable to use the latter, because it would serve to create a Reference to a Value Object too. 

The Domain has all Entities and Value Objects available. This decision occurred after a observation of a Domain Model. In fact all Entities and Value Objects belong to the Domain Model and all Value Objects can be used by the Entities. To restrict the usage of the Value Objects there are validations to ensure the consistency of the Domain Model.



## Persistence -> C4

### Metamodel
The representation of DDD model has undergone several changes. The following components have been added: 



### DSL
The DSL project was created based on the metamodel decribed above. 

### ATL
The following ATL tranformations were developed (based on rules):

UseCaseModel2DbaseModel - receive a UseCase Model and transform on a DBase model;

UsecaseToTable(uc: MMUseCase!UseCase) - check the condition to transform a usecase on a database table;

tableConstraintColumnKey(tableName: String, uc: MMUseCase!UseCase) - create the primary key constraint applicable in the table created on the previous rule (UsecaseToTable);

newTableColumnKey(tableName: String) - create the column to store the primary key of the prevouis mencionated table;

newExtendRelationship(relExtend: MMUseCase!Extend) - create the relationship between the created table and extended table;

relationshipExtendTable(rel: MMUseCase!Extend) - auxiliary rule of previous mencionated rule;

newIncludeRelationship(relInclude: MMUseCase!Include) - create the relationship between the created table and included table;

relationshipIncludeTable(rel: MMUseCase!Include) - auxiliary rule of previous mencionated rule;

newFKConstraint(tableName: String) - create the foreign key constraint applicable in the table with relationship;

newFKColumn(tableName: String) - create the column to store the foreign key of the prevouis mencionated table/rule;

These rules aim to turn use cases into data persistence tables.