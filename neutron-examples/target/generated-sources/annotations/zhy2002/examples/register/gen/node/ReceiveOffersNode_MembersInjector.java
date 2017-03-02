package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.ReceiveOffersNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiveOffersNode_MembersInjector implements MembersInjector<ReceiveOffersNode> {
  private final Provider<ReceiveOffersNodeComponent.Builder> builderProvider;

  public ReceiveOffersNode_MembersInjector(
      Provider<ReceiveOffersNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ReceiveOffersNode> create(
      Provider<ReceiveOffersNodeComponent.Builder> builderProvider) {
    return new ReceiveOffersNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ReceiveOffersNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ReceiveOffersNode instance, Provider<ReceiveOffersNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
