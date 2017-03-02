package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LoanOwingAmountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanOwingAmountNode_MembersInjector
    implements MembersInjector<LoanOwingAmountNode> {
  private final Provider<LoanOwingAmountNodeComponent.Builder> builderProvider;

  public LoanOwingAmountNode_MembersInjector(
      Provider<LoanOwingAmountNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LoanOwingAmountNode> create(
      Provider<LoanOwingAmountNodeComponent.Builder> builderProvider) {
    return new LoanOwingAmountNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(LoanOwingAmountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      LoanOwingAmountNode instance,
      Provider<LoanOwingAmountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
