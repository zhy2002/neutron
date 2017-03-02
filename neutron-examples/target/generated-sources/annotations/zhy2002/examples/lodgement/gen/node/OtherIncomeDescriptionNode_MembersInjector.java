package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherIncomeDescriptionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeDescriptionNode_MembersInjector
    implements MembersInjector<OtherIncomeDescriptionNode> {
  private final Provider<OtherIncomeDescriptionNodeComponent.Builder> builderProvider;

  public OtherIncomeDescriptionNode_MembersInjector(
      Provider<OtherIncomeDescriptionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherIncomeDescriptionNode> create(
      Provider<OtherIncomeDescriptionNodeComponent.Builder> builderProvider) {
    return new OtherIncomeDescriptionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherIncomeDescriptionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherIncomeDescriptionNode instance,
      Provider<OtherIncomeDescriptionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
