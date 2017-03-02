package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeNodeChildProvider_MembersInjector
    implements MembersInjector<OtherIncomeNodeChildProvider> {
  private final MembersInjector<OtherIncomeDescriptionNode>
      otherIncomeDescriptionNodeInjectorMembersInjector;

  private final MembersInjector<OtherIncomeTypeNode> otherIncomeTypeNodeInjectorMembersInjector;

  private final MembersInjector<OtherIncomeAmountNode> otherIncomeAmountNodeInjectorMembersInjector;

  private final MembersInjector<OtherIncomePreviousYearNode>
      otherIncomePreviousYearNodeInjectorMembersInjector;

  private final MembersInjector<OtherIncomeAddBackTypeNode>
      otherIncomeAddBackTypeNodeInjectorMembersInjector;

  public OtherIncomeNodeChildProvider_MembersInjector(
      MembersInjector<OtherIncomeDescriptionNode> otherIncomeDescriptionNodeInjectorMembersInjector,
      MembersInjector<OtherIncomeTypeNode> otherIncomeTypeNodeInjectorMembersInjector,
      MembersInjector<OtherIncomeAmountNode> otherIncomeAmountNodeInjectorMembersInjector,
      MembersInjector<OtherIncomePreviousYearNode>
          otherIncomePreviousYearNodeInjectorMembersInjector,
      MembersInjector<OtherIncomeAddBackTypeNode>
          otherIncomeAddBackTypeNodeInjectorMembersInjector) {
    assert otherIncomeDescriptionNodeInjectorMembersInjector != null;
    this.otherIncomeDescriptionNodeInjectorMembersInjector =
        otherIncomeDescriptionNodeInjectorMembersInjector;
    assert otherIncomeTypeNodeInjectorMembersInjector != null;
    this.otherIncomeTypeNodeInjectorMembersInjector = otherIncomeTypeNodeInjectorMembersInjector;
    assert otherIncomeAmountNodeInjectorMembersInjector != null;
    this.otherIncomeAmountNodeInjectorMembersInjector =
        otherIncomeAmountNodeInjectorMembersInjector;
    assert otherIncomePreviousYearNodeInjectorMembersInjector != null;
    this.otherIncomePreviousYearNodeInjectorMembersInjector =
        otherIncomePreviousYearNodeInjectorMembersInjector;
    assert otherIncomeAddBackTypeNodeInjectorMembersInjector != null;
    this.otherIncomeAddBackTypeNodeInjectorMembersInjector =
        otherIncomeAddBackTypeNodeInjectorMembersInjector;
  }

  public static MembersInjector<OtherIncomeNodeChildProvider> create(
      MembersInjector<OtherIncomeDescriptionNode> otherIncomeDescriptionNodeInjectorMembersInjector,
      MembersInjector<OtherIncomeTypeNode> otherIncomeTypeNodeInjectorMembersInjector,
      MembersInjector<OtherIncomeAmountNode> otherIncomeAmountNodeInjectorMembersInjector,
      MembersInjector<OtherIncomePreviousYearNode>
          otherIncomePreviousYearNodeInjectorMembersInjector,
      MembersInjector<OtherIncomeAddBackTypeNode>
          otherIncomeAddBackTypeNodeInjectorMembersInjector) {
    return new OtherIncomeNodeChildProvider_MembersInjector(
        otherIncomeDescriptionNodeInjectorMembersInjector,
        otherIncomeTypeNodeInjectorMembersInjector,
        otherIncomeAmountNodeInjectorMembersInjector,
        otherIncomePreviousYearNodeInjectorMembersInjector,
        otherIncomeAddBackTypeNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(OtherIncomeNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.otherIncomeDescriptionNodeInjector = otherIncomeDescriptionNodeInjectorMembersInjector;
    instance.otherIncomeTypeNodeInjector = otherIncomeTypeNodeInjectorMembersInjector;
    instance.otherIncomeAmountNodeInjector = otherIncomeAmountNodeInjectorMembersInjector;
    instance.otherIncomePreviousYearNodeInjector =
        otherIncomePreviousYearNodeInjectorMembersInjector;
    instance.otherIncomeAddBackTypeNodeInjector = otherIncomeAddBackTypeNodeInjectorMembersInjector;
  }

  public static void injectOtherIncomeDescriptionNodeInjector(
      OtherIncomeNodeChildProvider instance,
      MembersInjector<OtherIncomeDescriptionNode> otherIncomeDescriptionNodeInjector) {
    instance.otherIncomeDescriptionNodeInjector = otherIncomeDescriptionNodeInjector;
  }

  public static void injectOtherIncomeTypeNodeInjector(
      OtherIncomeNodeChildProvider instance,
      MembersInjector<OtherIncomeTypeNode> otherIncomeTypeNodeInjector) {
    instance.otherIncomeTypeNodeInjector = otherIncomeTypeNodeInjector;
  }

  public static void injectOtherIncomeAmountNodeInjector(
      OtherIncomeNodeChildProvider instance,
      MembersInjector<OtherIncomeAmountNode> otherIncomeAmountNodeInjector) {
    instance.otherIncomeAmountNodeInjector = otherIncomeAmountNodeInjector;
  }

  public static void injectOtherIncomePreviousYearNodeInjector(
      OtherIncomeNodeChildProvider instance,
      MembersInjector<OtherIncomePreviousYearNode> otherIncomePreviousYearNodeInjector) {
    instance.otherIncomePreviousYearNodeInjector = otherIncomePreviousYearNodeInjector;
  }

  public static void injectOtherIncomeAddBackTypeNodeInjector(
      OtherIncomeNodeChildProvider instance,
      MembersInjector<OtherIncomeAddBackTypeNode> otherIncomeAddBackTypeNodeInjector) {
    instance.otherIncomeAddBackTypeNodeInjector = otherIncomeAddBackTypeNodeInjector;
  }
}
