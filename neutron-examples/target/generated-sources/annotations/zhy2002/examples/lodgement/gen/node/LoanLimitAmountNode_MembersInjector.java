package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LoanLimitAmountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanLimitAmountNode_MembersInjector
    implements MembersInjector<LoanLimitAmountNode> {
  private final Provider<LoanLimitAmountNodeComponent.Builder> builderProvider;

  public LoanLimitAmountNode_MembersInjector(
      Provider<LoanLimitAmountNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LoanLimitAmountNode> create(
      Provider<LoanLimitAmountNodeComponent.Builder> builderProvider) {
    return new LoanLimitAmountNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(LoanLimitAmountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      LoanLimitAmountNode instance,
      Provider<LoanLimitAmountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
