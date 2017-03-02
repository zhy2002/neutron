package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustRegistrationDateNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustRegistrationDateNode_MembersInjector
    implements MembersInjector<TrustRegistrationDateNode> {
  private final Provider<TrustRegistrationDateNodeComponent.Builder> builderProvider;

  public TrustRegistrationDateNode_MembersInjector(
      Provider<TrustRegistrationDateNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustRegistrationDateNode> create(
      Provider<TrustRegistrationDateNodeComponent.Builder> builderProvider) {
    return new TrustRegistrationDateNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TrustRegistrationDateNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TrustRegistrationDateNode instance,
      Provider<TrustRegistrationDateNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
