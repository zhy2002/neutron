package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustNameNode_MembersInjector implements MembersInjector<TrustNameNode> {
  private final Provider<TrustNameNodeComponent.Builder> builderProvider;

  public TrustNameNode_MembersInjector(Provider<TrustNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustNameNode> create(
      Provider<TrustNameNodeComponent.Builder> builderProvider) {
    return new TrustNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TrustNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TrustNameNode instance, Provider<TrustNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
