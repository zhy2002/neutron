package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherIncomeAmountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeAmountNode_MembersInjector
    implements MembersInjector<OtherIncomeAmountNode> {
  private final Provider<OtherIncomeAmountNodeComponent.Builder> builderProvider;

  public OtherIncomeAmountNode_MembersInjector(
      Provider<OtherIncomeAmountNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherIncomeAmountNode> create(
      Provider<OtherIncomeAmountNodeComponent.Builder> builderProvider) {
    return new OtherIncomeAmountNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherIncomeAmountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherIncomeAmountNode instance,
      Provider<OtherIncomeAmountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
