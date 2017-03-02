package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageInterestOnlyExpiryDateNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageInterestOnlyExpiryDateNode_MembersInjector
    implements MembersInjector<MortgageInterestOnlyExpiryDateNode> {
  private final Provider<MortgageInterestOnlyExpiryDateNodeComponent.Builder> builderProvider;

  public MortgageInterestOnlyExpiryDateNode_MembersInjector(
      Provider<MortgageInterestOnlyExpiryDateNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageInterestOnlyExpiryDateNode> create(
      Provider<MortgageInterestOnlyExpiryDateNodeComponent.Builder> builderProvider) {
    return new MortgageInterestOnlyExpiryDateNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageInterestOnlyExpiryDateNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageInterestOnlyExpiryDateNode instance,
      Provider<MortgageInterestOnlyExpiryDateNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
