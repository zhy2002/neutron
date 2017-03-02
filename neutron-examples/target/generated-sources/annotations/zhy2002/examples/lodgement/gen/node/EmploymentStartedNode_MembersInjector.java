package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.EmploymentStartedNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStartedNode_MembersInjector
    implements MembersInjector<EmploymentStartedNode> {
  private final Provider<MonthYearNodeChildProvider> providerProvider;

  private final Provider<EmploymentStartedNodeComponent.Builder> builderProvider;

  public EmploymentStartedNode_MembersInjector(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<EmploymentStartedNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<EmploymentStartedNode> create(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<EmploymentStartedNodeComponent.Builder> builderProvider) {
    return new EmploymentStartedNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(EmploymentStartedNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((MonthYearNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      EmploymentStartedNode instance,
      Provider<EmploymentStartedNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
