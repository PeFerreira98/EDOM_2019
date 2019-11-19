/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c0.dsl.usecase.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import pt.isep.edom.project.c0.dsl.usecase.services.UseCaseGrammarAccess;
import pt.isep.edom.project.c0.mm.usecase.Actor;
import pt.isep.edom.project.c0.mm.usecase.Association;
import pt.isep.edom.project.c0.mm.usecase.Extend;
import pt.isep.edom.project.c0.mm.usecase.Include;
import pt.isep.edom.project.c0.mm.usecase.UseCase;
import pt.isep.edom.project.c0.mm.usecase.UseCaseModel;
import pt.isep.edom.project.c0.mm.usecase.UsecasePackage;

@SuppressWarnings("all")
public class UseCaseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UseCaseGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UsecasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UsecasePackage.ACTOR:
				sequence_Actor(context, (Actor) semanticObject); 
				return; 
			case UsecasePackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case UsecasePackage.EXTEND:
				sequence_Extend(context, (Extend) semanticObject); 
				return; 
			case UsecasePackage.INCLUDE:
				sequence_Include(context, (Include) semanticObject); 
				return; 
			case UsecasePackage.USE_CASE:
				sequence_UseCase(context, (UseCase) semanticObject); 
				return; 
			case UsecasePackage.USE_CASE_MODEL:
				sequence_UseCaseModel(context, (UseCaseModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Actor returns Actor
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Actor(ISerializationContext context, Actor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UsecasePackage.Literals.ACTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsecasePackage.Literals.ACTOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (name=EString actor=[Actor|EString] usecase=[UseCase|EString])
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UsecasePackage.Literals.ASSOCIATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsecasePackage.Literals.ASSOCIATION__NAME));
			if (transientValues.isValueTransient(semanticObject, UsecasePackage.Literals.ASSOCIATION__ACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsecasePackage.Literals.ASSOCIATION__ACTOR));
			if (transientValues.isValueTransient(semanticObject, UsecasePackage.Literals.ASSOCIATION__USECASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsecasePackage.Literals.ASSOCIATION__USECASE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssociationAccess().getActorActorEStringParserRuleCall_4_0_1(), semanticObject.eGet(UsecasePackage.Literals.ASSOCIATION__ACTOR, false));
		feeder.accept(grammarAccess.getAssociationAccess().getUsecaseUseCaseEStringParserRuleCall_6_0_1(), semanticObject.eGet(UsecasePackage.Literals.ASSOCIATION__USECASE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Extend returns Extend
	 *
	 * Constraint:
	 *     (name=EString usecase=[UseCase|EString])
	 */
	protected void sequence_Extend(ISerializationContext context, Extend semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UsecasePackage.Literals.RELATIONSHIP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsecasePackage.Literals.RELATIONSHIP__NAME));
			if (transientValues.isValueTransient(semanticObject, UsecasePackage.Literals.EXTEND__USECASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsecasePackage.Literals.EXTEND__USECASE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExtendAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExtendAccess().getUsecaseUseCaseEStringParserRuleCall_4_0_1(), semanticObject.eGet(UsecasePackage.Literals.EXTEND__USECASE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Include returns Include
	 *
	 * Constraint:
	 *     (name=EString usecase=[UseCase|EString])
	 */
	protected void sequence_Include(ISerializationContext context, Include semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UsecasePackage.Literals.RELATIONSHIP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsecasePackage.Literals.RELATIONSHIP__NAME));
			if (transientValues.isValueTransient(semanticObject, UsecasePackage.Literals.INCLUDE__USECASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsecasePackage.Literals.INCLUDE__USECASE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIncludeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIncludeAccess().getUsecaseUseCaseEStringParserRuleCall_4_0_1(), semanticObject.eGet(UsecasePackage.Literals.INCLUDE__USECASE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UseCaseModel returns UseCaseModel
	 *
	 * Constraint:
	 *     (name=EString (actor+=Actor actor+=Actor*)? (association+=Association association+=Association*)? (usecase+=UseCase usecase+=UseCase*)?)
	 */
	protected void sequence_UseCaseModel(ISerializationContext context, UseCaseModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UseCase returns UseCase
	 *
	 * Constraint:
	 *     (name=EString (extend+=Extend extend+=Extend*)? (include+=Include include+=Include*)?)
	 */
	protected void sequence_UseCase(ISerializationContext context, UseCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
