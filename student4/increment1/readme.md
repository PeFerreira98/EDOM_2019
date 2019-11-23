# EDOM - Project Increment 1

"For this assignment you should produce the following documentation (in the readme.md
file of the folder for this increment):
1- Describe and explain the validations added to the requirements models;
2- Analyze possible alternative representations for the requirements diagrams;
3- Analyze possible problems in the coding of the generation of the diagram;"

1- As validações OCL adicionadas ao eCore "gorgeousfood" foram distribuidas de acordo com a responsabilidade de cada entidade criada no modelo.

    MealItem
    a. O atributo MealItemID é positivo e um número inteiro;
    b. O MealItem necessita obrigatoriamente ter data de expiro (ExpDate) e data de produção (PrdDate);
    c. A data de expiro (ExpDate) tem de ser menor que a data de produção (PrdDate).

    class MealItem
	    {
		    attribute MealItemID : _'ecore.xml.type'::Int[1];
            attribute ExpDate : ecore::EDate[?];
            attribute PrdDate : ecore::EDate[?];
            property meal : Meal[*|1] { ordered composes };
            invariant mustHaveID: not MealItemID.oclIsInvalid();
            invariant mustHavePositiveID: MealItemID > 0;
            invariant mustHaveExpDate: not ExpDate.oclIsInvalid();
            invariant mustHavePrdDate: not PrdDate.oclIsInvalid();
            invariant expDateNextPrdDate: self.ExpDate > self.PrdDate;
        }

    Outras validações podem ser consultadas no ficheiro gorgeousfood.ecore da pasta instances.


2- ...


3- A representação de atributos do tipo lista dentro de uma entidade.
