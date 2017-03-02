package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelfEmployedNodeChildProvider_MembersInjector
    implements MembersInjector<SelfEmployedNodeChildProvider> {
  private final MembersInjector<ProfitPreviousYearNode>
      profitPreviousYearNodeInjectorMembersInjector;

  private final MembersInjector<BusinessTypeNode> businessTypeNodeInjectorMembersInjector;

  private final MembersInjector<ProfitThisYearNode> profitThisYearNodeInjectorMembersInjector;

  public SelfEmployedNodeChildProvider_MembersInjector(
      MembersInjector<ProfitPreviousYearNode> profitPreviousYearNodeInjectorMembersInjector,
      MembersInjector<BusinessTypeNode> businessTypeNodeInjectorMembersInjector,
      MembersInjector<ProfitThisYearNode> profitThisYearNodeInjectorMembersInjector) {
    assert profitPreviousYearNodeInjectorMembersInjector != null;
    this.profitPreviousYearNodeInjectorMembersInjector =
        profitPreviousYearNodeInjectorMembersInjector;
    assert businessTypeNodeInjectorMembersInjector != null;
    this.businessTypeNodeInjectorMembersInjector = businessTypeNodeInjectorMembersInjector;
    assert profitThisYearNodeInjectorMembersInjector != null;
    this.profitThisYearNodeInjectorMembersInjector = profitThisYearNodeInjectorMembersInjector;
  }

  public static MembersInjector<SelfEmployedNodeChildProvider> create(
      MembersInjector<ProfitPreviousYearNode> profitPreviousYearNodeInjectorMembersInjector,
      MembersInjector<BusinessTypeNode> businessTypeNodeInjectorMembersInjector,
      MembersInjector<ProfitThisYearNode> profitThisYearNodeInjectorMembersInjector) {
    return new SelfEmployedNodeChildProvider_MembersInjector(
        profitPreviousYearNodeInjectorMembersInjector,
        businessTypeNodeInjectorMembersInjector,
        profitThisYearNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(SelfEmployedNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.profitPreviousYearNodeInjector = profitPreviousYearNodeInjectorMembersInjector;
    instance.businessTypeNodeInjector = businessTypeNodeInjectorMembersInjector;
    instance.profitThisYearNodeInjector = profitThisYearNodeInjectorMembersInjector;
  }

  public static void injectProfitPreviousYearNodeInjector(
      SelfEmployedNodeChildProvider instance,
      MembersInjector<ProfitPreviousYearNode> profitPreviousYearNodeInjector) {
    instance.profitPreviousYearNodeInjector = profitPreviousYearNodeInjector;
  }

  public static void injectBusinessTypeNodeInjector(
      SelfEmployedNodeChildProvider instance,
      MembersInjector<BusinessTypeNode> businessTypeNodeInjector) {
    instance.businessTypeNodeInjector = businessTypeNodeInjector;
  }

  public static void injectProfitThisYearNodeInjector(
      SelfEmployedNodeChildProvider instance,
      MembersInjector<ProfitThisYearNode> profitThisYearNodeInjector) {
    instance.profitThisYearNodeInjector = profitThisYearNodeInjector;
  }
}
