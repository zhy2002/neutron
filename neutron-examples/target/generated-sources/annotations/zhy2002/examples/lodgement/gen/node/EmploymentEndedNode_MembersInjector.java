package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.EmploymentEndedNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentEndedNode_MembersInjector
    implements MembersInjector<EmploymentEndedNode> {
  private final Provider<MonthYearNodeChildProvider> providerProvider;

  private final Provider<EmploymentEndedNodeComponent.Builder> builderProvider;

  public EmploymentEndedNode_MembersInjector(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<EmploymentEndedNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<EmploymentEndedNode> create(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<EmploymentEndedNodeComponent.Builder> builderProvider) {
    return new EmploymentEndedNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(EmploymentEndedNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((MonthYearNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      EmploymentEndedNode instance,
      Provider<EmploymentEndedNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
