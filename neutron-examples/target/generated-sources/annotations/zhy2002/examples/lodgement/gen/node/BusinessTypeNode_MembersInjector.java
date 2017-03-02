package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.BusinessTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BusinessTypeNode_MembersInjector implements MembersInjector<BusinessTypeNode> {
  private final Provider<BusinessTypeNodeComponent.Builder> builderProvider;

  public BusinessTypeNode_MembersInjector(
      Provider<BusinessTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<BusinessTypeNode> create(
      Provider<BusinessTypeNodeComponent.Builder> builderProvider) {
    return new BusinessTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(BusinessTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      BusinessTypeNode instance, Provider<BusinessTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
