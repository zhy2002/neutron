package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageLimitAmountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLimitAmountNode_MembersInjector
    implements MembersInjector<MortgageLimitAmountNode> {
  private final Provider<MortgageLimitAmountNodeComponent.Builder> builderProvider;

  public MortgageLimitAmountNode_MembersInjector(
      Provider<MortgageLimitAmountNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageLimitAmountNode> create(
      Provider<MortgageLimitAmountNodeComponent.Builder> builderProvider) {
    return new MortgageLimitAmountNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageLimitAmountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageLimitAmountNode instance,
      Provider<MortgageLimitAmountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
