package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherIncomeTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeTypeNode_MembersInjector
    implements MembersInjector<OtherIncomeTypeNode> {
  private final Provider<OtherIncomeTypeNodeComponent.Builder> builderProvider;

  public OtherIncomeTypeNode_MembersInjector(
      Provider<OtherIncomeTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherIncomeTypeNode> create(
      Provider<OtherIncomeTypeNodeComponent.Builder> builderProvider) {
    return new OtherIncomeTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherIncomeTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherIncomeTypeNode instance,
      Provider<OtherIncomeTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
