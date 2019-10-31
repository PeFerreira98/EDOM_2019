# Examples of OCL Queries

If you run a new instance of Eclipse with the Mind Map textual DSL plugin activated you can test OCL expressions.

Create a textual instance of a Mind Map like, for instance, the following:

```
Map { 
	title "Agenda Map" elements {
		Topic "Agenda App" {
			start "2018-09-01" end '2018-10-01' subtopics ( "Contacts", "Meeting" ) 
		},
		Topic "Contacts" {
			start "2018-09-01" end '2018-10-01' subtopics ( "Address", "Email" ) parent "Agenda App" 
		},
		Topic "Schedule Meeting" {
			start "2018-09-01" end '2030-10-01' parent "Meeting"
		},
		Topic "Address" {
			start "2018-01-01" end '2020-01-01' parent "Contacts"
		},
		Topic "Meeting" { 
			start "2018-01-01" end '2020-01-01' subtopics ( "Schedule Meeting", "Room" ) parent "Agenda App" 
		},
		Topic "Email" { 
			start "2018-01-01" end '2020-01-01' parent "Contacts"
		},
		Topic "Room" { 
			start "2018-01-01" end '2020-01-01' parent "Meeting"
		},
		Relationship "meeting2contact" { source "Meeting" target "Contacts" }
	} 
}
```

In the Outline view select "Agenda Map" and experiment the following OCL expressions in the "Xtext OCL Console".

1) All instances of `Topic`

	Topic.allInstances()

2) All instances of `Relationship`

	Relationship.allInstances()

3) The number of instances of `Relationship`

	Relationship.allInstances()->size()

4) In the collection `elements` (in Map), all the instances that are `Topic`

	self.elements->select(x | x.oclIsTypeOf(Topic) )

5) In the collection `elements` (in `Map`), all the instances that are `Relationship`

	self.elements->select(x | x.oclIsTypeOf(Relationship) )

6) In `Map` the `name` of all `elements` of type `Relationship`

	self.elements->select(x | x.oclIsTypeOf(Relationship) ).name
	
or

	self.elements->select(x | x.oclIsTypeOf(Relationship))->collect(y | y.name)

7) All the `Topic` of the `Map` that are not `rootTopics`

	self.elements->select(x | x.oclIsTypeOf(Topic) )->symmetricDifference(self.rootTopics)

8) Get a collection with only the `start` and `end` dates of all the `Topic`

	Topic.allInstances()->collect(x | Tuple{ date1=x.start, date2=x.end})

9) Get the greater `end` date for all `Topic`

 Topic.allInstances()->asOrderedSet()->iterate(x: Topic; r:Sequence(Topic)=Sequence{Topic.allInstances()->asOrderedSet()->first()} | if (x.end > r->last().end) then r->including(x) else r endif)->last().end

10) Are there `Topic` with `name` length greater than 10 characters?
	
	Topic.allInstances()->exists(x | x.name.size()>10 )

11) All the `Topic` have name with more than 10 characters?

	Topic.allInstances()->forAll(x | x.name.size()>10 )

12) All the `name` of `Topic` are unique?

	Topic.allInstances()->isUnique(x | x.name )

13) All the `start` dates of `Topic` are unique?

	Topic.allInstances()->isUnique(x | x.start )

14) Get an ordered collection of the `name` of all `Topic`

	Topic.allInstances()->sortedBy(name).name



	