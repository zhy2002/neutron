package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustTypeNode_MembersInjector implements MembersInjector<TrustTypeNode> {
  private final Provider<TrustTypeNodeComponent.Builder> builderProvider;

  public TrustTypeNode_MembersInjector(Provider<TrustTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustTypeNode> create(
      Provider<TrustTypeNodeComponent.Builder> builderProvider) {
    return new TrustTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TrustTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TrustTypeNode instance, Provider<TrustTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
