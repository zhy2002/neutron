package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SelectRelatedPersonNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonNode_MembersInjector
    implements MembersInjector<SelectRelatedPersonNode> {
  private final Provider<SelectRelatedPersonNodeChildProvider> providerProvider;

  private final Provider<SelectRelatedPersonNodeComponent.Builder> builderProvider;

  public SelectRelatedPersonNode_MembersInjector(
      Provider<SelectRelatedPersonNodeChildProvider> providerProvider,
      Provider<SelectRelatedPersonNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SelectRelatedPersonNode> create(
      Provider<SelectRelatedPersonNodeChildProvider> providerProvider,
      Provider<SelectRelatedPersonNodeComponent.Builder> builderProvider) {
    return new SelectRelatedPersonNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(SelectRelatedPersonNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      SelectRelatedPersonNode instance,
      Provider<SelectRelatedPersonNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      SelectRelatedPersonNode instance,
      Provider<SelectRelatedPersonNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
