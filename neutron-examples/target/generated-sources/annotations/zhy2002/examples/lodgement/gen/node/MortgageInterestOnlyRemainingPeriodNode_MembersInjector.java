package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageInterestOnlyRemainingPeriodNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageInterestOnlyRemainingPeriodNode_MembersInjector
    implements MembersInjector<MortgageInterestOnlyRemainingPeriodNode> {
  private final Provider<MortgageInterestOnlyRemainingPeriodNodeComponent.Builder> builderProvider;

  public MortgageInterestOnlyRemainingPeriodNode_MembersInjector(
      Provider<MortgageInterestOnlyRemainingPeriodNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageInterestOnlyRemainingPeriodNode> create(
      Provider<MortgageInterestOnlyRemainingPeriodNodeComponent.Builder> builderProvider) {
    return new MortgageInterestOnlyRemainingPeriodNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageInterestOnlyRemainingPeriodNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageInterestOnlyRemainingPeriodNode instance,
      Provider<MortgageInterestOnlyRemainingPeriodNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
