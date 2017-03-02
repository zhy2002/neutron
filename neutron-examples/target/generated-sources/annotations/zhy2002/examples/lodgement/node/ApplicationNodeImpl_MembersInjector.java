package zhy2002.examples.lodgement.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ApplicationNodeComponent;
import zhy2002.examples.lodgement.gen.node.ApplicationNodeChildProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNodeImpl_MembersInjector
    implements MembersInjector<ApplicationNodeImpl> {
  private final Provider<ApplicationNodeChildProvider> providerProvider;

  private final Provider<ApplicationNodeComponent.Builder> builderProvider;

  public ApplicationNodeImpl_MembersInjector(
      Provider<ApplicationNodeChildProvider> providerProvider,
      Provider<ApplicationNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ApplicationNodeImpl> create(
      Provider<ApplicationNodeChildProvider> providerProvider,
      Provider<ApplicationNodeComponent.Builder> builderProvider) {
    return new ApplicationNodeImpl_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ApplicationNodeImpl instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.examples.lodgement.gen.node.ApplicationNode_MembersInjector.injectReceiveNodeProvider(
        instance, providerProvider);
    zhy2002.examples.lodgement.gen.node.ApplicationNode_MembersInjector.injectCreateComponent(
        instance, builderProvider);
  }
}
