package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PrimarySecurityFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrimarySecurityFlagNode_MembersInjector
    implements MembersInjector<PrimarySecurityFlagNode> {
  private final Provider<PrimarySecurityFlagNodeComponent.Builder> builderProvider;

  public PrimarySecurityFlagNode_MembersInjector(
      Provider<PrimarySecurityFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PrimarySecurityFlagNode> create(
      Provider<PrimarySecurityFlagNodeComponent.Builder> builderProvider) {
    return new PrimarySecurityFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PrimarySecurityFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PrimarySecurityFlagNode instance,
      Provider<PrimarySecurityFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
