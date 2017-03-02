package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonNodeChildProvider_MembersInjector
    implements MembersInjector<PersonNodeChildProvider> {
  private final MembersInjector<PersonGeneralNode> personGeneralNodeInjectorMembersInjector;

  private final MembersInjector<PersonOtherIncomeListNode>
      personOtherIncomeListNodeInjectorMembersInjector;

  private final MembersInjector<PersonResponsibleLendNode>
      personResponsibleLendNodeInjectorMembersInjector;

  private final MembersInjector<CurrentEmploymentListNode>
      currentEmploymentListNodeInjectorMembersInjector;

  private final MembersInjector<PersonPrivacyNode> personPrivacyNodeInjectorMembersInjector;

  private final MembersInjector<PersonContactNode> personContactNodeInjectorMembersInjector;

  private final MembersInjector<PreviousEmploymentListNode>
      previousEmploymentListNodeInjectorMembersInjector;

  private final MembersInjector<PersonTrustNode> personTrustNodeInjectorMembersInjector;

  public PersonNodeChildProvider_MembersInjector(
      MembersInjector<PersonGeneralNode> personGeneralNodeInjectorMembersInjector,
      MembersInjector<PersonOtherIncomeListNode> personOtherIncomeListNodeInjectorMembersInjector,
      MembersInjector<PersonResponsibleLendNode> personResponsibleLendNodeInjectorMembersInjector,
      MembersInjector<CurrentEmploymentListNode> currentEmploymentListNodeInjectorMembersInjector,
      MembersInjector<PersonPrivacyNode> personPrivacyNodeInjectorMembersInjector,
      MembersInjector<PersonContactNode> personContactNodeInjectorMembersInjector,
      MembersInjector<PreviousEmploymentListNode> previousEmploymentListNodeInjectorMembersInjector,
      MembersInjector<PersonTrustNode> personTrustNodeInjectorMembersInjector) {
    assert personGeneralNodeInjectorMembersInjector != null;
    this.personGeneralNodeInjectorMembersInjector = personGeneralNodeInjectorMembersInjector;
    assert personOtherIncomeListNodeInjectorMembersInjector != null;
    this.personOtherIncomeListNodeInjectorMembersInjector =
        personOtherIncomeListNodeInjectorMembersInjector;
    assert personResponsibleLendNodeInjectorMembersInjector != null;
    this.personResponsibleLendNodeInjectorMembersInjector =
        personResponsibleLendNodeInjectorMembersInjector;
    assert currentEmploymentListNodeInjectorMembersInjector != null;
    this.currentEmploymentListNodeInjectorMembersInjector =
        currentEmploymentListNodeInjectorMembersInjector;
    assert personPrivacyNodeInjectorMembersInjector != null;
    this.personPrivacyNodeInjectorMembersInjector = personPrivacyNodeInjectorMembersInjector;
    assert personContactNodeInjectorMembersInjector != null;
    this.personContactNodeInjectorMembersInjector = personContactNodeInjectorMembersInjector;
    assert previousEmploymentListNodeInjectorMembersInjector != null;
    this.previousEmploymentListNodeInjectorMembersInjector =
        previousEmploymentListNodeInjectorMembersInjector;
    assert personTrustNodeInjectorMembersInjector != null;
    this.personTrustNodeInjectorMembersInjector = personTrustNodeInjectorMembersInjector;
  }

  public static MembersInjector<PersonNodeChildProvider> create(
      MembersInjector<PersonGeneralNode> personGeneralNodeInjectorMembersInjector,
      MembersInjector<PersonOtherIncomeListNode> personOtherIncomeListNodeInjectorMembersInjector,
      MembersInjector<PersonResponsibleLendNode> personResponsibleLendNodeInjectorMembersInjector,
      MembersInjector<CurrentEmploymentListNode> currentEmploymentListNodeInjectorMembersInjector,
      MembersInjector<PersonPrivacyNode> personPrivacyNodeInjectorMembersInjector,
      MembersInjector<PersonContactNode> personContactNodeInjectorMembersInjector,
      MembersInjector<PreviousEmploymentListNode> previousEmploymentListNodeInjectorMembersInjector,
      MembersInjector<PersonTrustNode> personTrustNodeInjectorMembersInjector) {
    return new PersonNodeChildProvider_MembersInjector(
        personGeneralNodeInjectorMembersInjector,
        personOtherIncomeListNodeInjectorMembersInjector,
        personResponsibleLendNodeInjectorMembersInjector,
        currentEmploymentListNodeInjectorMembersInjector,
        personPrivacyNodeInjectorMembersInjector,
        personContactNodeInjectorMembersInjector,
        previousEmploymentListNodeInjectorMembersInjector,
        personTrustNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(PersonNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.personGeneralNodeInjector = personGeneralNodeInjectorMembersInjector;
    instance.personOtherIncomeListNodeInjector = personOtherIncomeListNodeInjectorMembersInjector;
    instance.personResponsibleLendNodeInjector = personResponsibleLendNodeInjectorMembersInjector;
    instance.currentEmploymentListNodeInjector = currentEmploymentListNodeInjectorMembersInjector;
    instance.personPrivacyNodeInjector = personPrivacyNodeInjectorMembersInjector;
    instance.personContactNodeInjector = personContactNodeInjectorMembersInjector;
    instance.previousEmploymentListNodeInjector = previousEmploymentListNodeInjectorMembersInjector;
    instance.personTrustNodeInjector = personTrustNodeInjectorMembersInjector;
  }

  public static void injectPersonGeneralNodeInjector(
      PersonNodeChildProvider instance,
      MembersInjector<PersonGeneralNode> personGeneralNodeInjector) {
    instance.personGeneralNodeInjector = personGeneralNodeInjector;
  }

  public static void injectPersonOtherIncomeListNodeInjector(
      PersonNodeChildProvider instance,
      MembersInjector<PersonOtherIncomeListNode> personOtherIncomeListNodeInjector) {
    instance.personOtherIncomeListNodeInjector = personOtherIncomeListNodeInjector;
  }

  public static void injectPersonResponsibleLendNodeInjector(
      PersonNodeChildProvider instance,
      MembersInjector<PersonResponsibleLendNode> personResponsibleLendNodeInjector) {
    instance.personResponsibleLendNodeInjector = personResponsibleLendNodeInjector;
  }

  public static void injectCurrentEmploymentListNodeInjector(
      PersonNodeChildProvider instance,
      MembersInjector<CurrentEmploymentListNode> currentEmploymentListNodeInjector) {
    instance.currentEmploymentListNodeInjector = currentEmploymentListNodeInjector;
  }

  public static void injectPersonPrivacyNodeInjector(
      PersonNodeChildProvider instance,
      MembersInjector<PersonPrivacyNode> personPrivacyNodeInjector) {
    instance.personPrivacyNodeInjector = personPrivacyNodeInjector;
  }

  public static void injectPersonContactNodeInjector(
      PersonNodeChildProvider instance,
      MembersInjector<PersonContactNode> personContactNodeInjector) {
    instance.personContactNodeInjector = personContactNodeInjector;
  }

  public static void injectPreviousEmploymentListNodeInjector(
      PersonNodeChildProvider instance,
      MembersInjector<PreviousEmploymentListNode> previousEmploymentListNodeInjector) {
    instance.previousEmploymentListNodeInjector = previousEmploymentListNodeInjector;
  }

  public static void injectPersonTrustNodeInjector(
      PersonNodeChildProvider instance, MembersInjector<PersonTrustNode> personTrustNodeInjector) {
    instance.personTrustNodeInjector = personTrustNodeInjector;
  }
}
