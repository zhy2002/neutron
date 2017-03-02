package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AddressRefListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressRefListNode_MembersInjector
    implements MembersInjector<AddressRefListNode> {
  private final Provider<AddressRefListNodeItemProvider> providerProvider;

  private final Provider<AddressRefListNodeComponent.Builder> builderProvider;

  public AddressRefListNode_MembersInjector(
      Provider<AddressRefListNodeItemProvider> providerProvider,
      Provider<AddressRefListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AddressRefListNode> create(
      Provider<AddressRefListNodeItemProvider> providerProvider,
      Provider<AddressRefListNodeComponent.Builder> builderProvider) {
    return new AddressRefListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(AddressRefListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      AddressRefListNode instance, Provider<AddressRefListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      AddressRefListNode instance, Provider<AddressRefListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
