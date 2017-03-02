package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherIncomeAddBackTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeAddBackTypeNode_MembersInjector
    implements MembersInjector<OtherIncomeAddBackTypeNode> {
  private final Provider<OtherIncomeAddBackTypeNodeComponent.Builder> builderProvider;

  public OtherIncomeAddBackTypeNode_MembersInjector(
      Provider<OtherIncomeAddBackTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherIncomeAddBackTypeNode> create(
      Provider<OtherIncomeAddBackTypeNodeComponent.Builder> builderProvider) {
    return new OtherIncomeAddBackTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherIncomeAddBackTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherIncomeAddBackTypeNode instance,
      Provider<OtherIncomeAddBackTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
