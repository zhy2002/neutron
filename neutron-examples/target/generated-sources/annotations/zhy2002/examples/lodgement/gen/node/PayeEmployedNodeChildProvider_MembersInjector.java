package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PayeEmployedNodeChildProvider_MembersInjector
    implements MembersInjector<PayeEmployedNodeChildProvider> {
  private final MembersInjector<GrossYearlySalaryNode> grossYearlySalaryNodeInjectorMembersInjector;

  public PayeEmployedNodeChildProvider_MembersInjector(
      MembersInjector<GrossYearlySalaryNode> grossYearlySalaryNodeInjectorMembersInjector) {
    assert grossYearlySalaryNodeInjectorMembersInjector != null;
    this.grossYearlySalaryNodeInjectorMembersInjector =
        grossYearlySalaryNodeInjectorMembersInjector;
  }

  public static MembersInjector<PayeEmployedNodeChildProvider> create(
      MembersInjector<GrossYearlySalaryNode> grossYearlySalaryNodeInjectorMembersInjector) {
    return new PayeEmployedNodeChildProvider_MembersInjector(
        grossYearlySalaryNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(PayeEmployedNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.grossYearlySalaryNodeInjector = grossYearlySalaryNodeInjectorMembersInjector;
  }

  public static void injectGrossYearlySalaryNodeInjector(
      PayeEmployedNodeChildProvider instance,
      MembersInjector<GrossYearlySalaryNode> grossYearlySalaryNodeInjector) {
    instance.grossYearlySalaryNodeInjector = grossYearlySalaryNodeInjector;
  }
}
