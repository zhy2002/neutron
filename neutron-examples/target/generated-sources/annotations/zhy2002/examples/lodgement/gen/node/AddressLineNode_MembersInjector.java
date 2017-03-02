package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AddressLineNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressLineNode_MembersInjector implements MembersInjector<AddressLineNode> {
  private final Provider<AddressLineNodeComponent.Builder> builderProvider;

  public AddressLineNode_MembersInjector(
      Provider<AddressLineNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AddressLineNode> create(
      Provider<AddressLineNodeComponent.Builder> builderProvider) {
    return new AddressLineNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AddressLineNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AddressLineNode instance, Provider<AddressLineNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
