package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageTermRemainingPeriodNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageTermRemainingPeriodNode_MembersInjector
    implements MembersInjector<MortgageTermRemainingPeriodNode> {
  private final Provider<MortgageTermRemainingPeriodNodeComponent.Builder> builderProvider;

  public MortgageTermRemainingPeriodNode_MembersInjector(
      Provider<MortgageTermRemainingPeriodNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageTermRemainingPeriodNode> create(
      Provider<MortgageTermRemainingPeriodNodeComponent.Builder> builderProvider) {
    return new MortgageTermRemainingPeriodNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageTermRemainingPeriodNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageTermRemainingPeriodNode instance,
      Provider<MortgageTermRemainingPeriodNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
