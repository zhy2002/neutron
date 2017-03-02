package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustSettlorNotRequiredReasonNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustSettlorNotRequiredReasonNode_MembersInjector
    implements MembersInjector<TrustSettlorNotRequiredReasonNode> {
  private final Provider<TrustSettlorNotRequiredReasonNodeComponent.Builder> builderProvider;

  public TrustSettlorNotRequiredReasonNode_MembersInjector(
      Provider<TrustSettlorNotRequiredReasonNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustSettlorNotRequiredReasonNode> create(
      Provider<TrustSettlorNotRequiredReasonNodeComponent.Builder> builderProvider) {
    return new TrustSettlorNotRequiredReasonNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TrustSettlorNotRequiredReasonNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TrustSettlorNotRequiredReasonNode instance,
      Provider<TrustSettlorNotRequiredReasonNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
