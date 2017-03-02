package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.UsedAsSecurityFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsedAsSecurityFlagNode_MembersInjector
    implements MembersInjector<UsedAsSecurityFlagNode> {
  private final Provider<UsedAsSecurityFlagNodeComponent.Builder> builderProvider;

  public UsedAsSecurityFlagNode_MembersInjector(
      Provider<UsedAsSecurityFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<UsedAsSecurityFlagNode> create(
      Provider<UsedAsSecurityFlagNodeComponent.Builder> builderProvider) {
    return new UsedAsSecurityFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(UsedAsSecurityFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      UsedAsSecurityFlagNode instance,
      Provider<UsedAsSecurityFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
