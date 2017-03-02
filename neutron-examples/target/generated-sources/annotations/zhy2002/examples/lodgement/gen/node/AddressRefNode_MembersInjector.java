package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AddressRefNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressRefNode_MembersInjector implements MembersInjector<AddressRefNode> {
  private final Provider<AddressRefNodeComponent.Builder> builderProvider;

  public AddressRefNode_MembersInjector(Provider<AddressRefNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AddressRefNode> create(
      Provider<AddressRefNodeComponent.Builder> builderProvider) {
    return new AddressRefNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AddressRefNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AddressRefNode instance, Provider<AddressRefNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
