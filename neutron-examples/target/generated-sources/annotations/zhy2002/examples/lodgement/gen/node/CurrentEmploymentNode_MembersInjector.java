package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CurrentEmploymentNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentNode_MembersInjector
    implements MembersInjector<CurrentEmploymentNode> {
  private final Provider<EmploymentNodeChildProvider> providerProvider;

  private final Provider<CurrentEmploymentNodeComponent.Builder> builderProvider;

  public CurrentEmploymentNode_MembersInjector(
      Provider<EmploymentNodeChildProvider> providerProvider,
      Provider<CurrentEmploymentNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CurrentEmploymentNode> create(
      Provider<EmploymentNodeChildProvider> providerProvider,
      Provider<CurrentEmploymentNodeComponent.Builder> builderProvider) {
    return new CurrentEmploymentNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CurrentEmploymentNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((EmploymentNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CurrentEmploymentNode instance,
      Provider<CurrentEmploymentNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
