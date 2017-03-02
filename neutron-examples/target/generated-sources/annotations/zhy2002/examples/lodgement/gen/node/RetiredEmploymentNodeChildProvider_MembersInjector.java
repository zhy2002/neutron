package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredEmploymentNodeChildProvider_MembersInjector
    implements MembersInjector<RetiredEmploymentNodeChildProvider> {
  private final MembersInjector<RetiredOnBenefitFlagNode>
      retiredOnBenefitFlagNodeInjectorMembersInjector;

  private final MembersInjector<RetiredSinceNode> retiredSinceNodeInjectorMembersInjector;

  public RetiredEmploymentNodeChildProvider_MembersInjector(
      MembersInjector<RetiredOnBenefitFlagNode> retiredOnBenefitFlagNodeInjectorMembersInjector,
      MembersInjector<RetiredSinceNode> retiredSinceNodeInjectorMembersInjector) {
    assert retiredOnBenefitFlagNodeInjectorMembersInjector != null;
    this.retiredOnBenefitFlagNodeInjectorMembersInjector =
        retiredOnBenefitFlagNodeInjectorMembersInjector;
    assert retiredSinceNodeInjectorMembersInjector != null;
    this.retiredSinceNodeInjectorMembersInjector = retiredSinceNodeInjectorMembersInjector;
  }

  public static MembersInjector<RetiredEmploymentNodeChildProvider> create(
      MembersInjector<RetiredOnBenefitFlagNode> retiredOnBenefitFlagNodeInjectorMembersInjector,
      MembersInjector<RetiredSinceNode> retiredSinceNodeInjectorMembersInjector) {
    return new RetiredEmploymentNodeChildProvider_MembersInjector(
        retiredOnBenefitFlagNodeInjectorMembersInjector, retiredSinceNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(RetiredEmploymentNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.retiredOnBenefitFlagNodeInjector = retiredOnBenefitFlagNodeInjectorMembersInjector;
    instance.retiredSinceNodeInjector = retiredSinceNodeInjectorMembersInjector;
  }

  public static void injectRetiredOnBenefitFlagNodeInjector(
      RetiredEmploymentNodeChildProvider instance,
      MembersInjector<RetiredOnBenefitFlagNode> retiredOnBenefitFlagNodeInjector) {
    instance.retiredOnBenefitFlagNodeInjector = retiredOnBenefitFlagNodeInjector;
  }

  public static void injectRetiredSinceNodeInjector(
      RetiredEmploymentNodeChildProvider instance,
      MembersInjector<RetiredSinceNode> retiredSinceNodeInjector) {
    instance.retiredSinceNodeInjector = retiredSinceNodeInjector;
  }
}
