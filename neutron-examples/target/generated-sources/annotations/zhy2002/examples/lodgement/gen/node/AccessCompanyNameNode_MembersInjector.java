package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AccessCompanyNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessCompanyNameNode_MembersInjector
    implements MembersInjector<AccessCompanyNameNode> {
  private final Provider<AccessCompanyNameNodeComponent.Builder> builderProvider;

  public AccessCompanyNameNode_MembersInjector(
      Provider<AccessCompanyNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AccessCompanyNameNode> create(
      Provider<AccessCompanyNameNodeComponent.Builder> builderProvider) {
    return new AccessCompanyNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AccessCompanyNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AccessCompanyNameNode instance,
      Provider<AccessCompanyNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
