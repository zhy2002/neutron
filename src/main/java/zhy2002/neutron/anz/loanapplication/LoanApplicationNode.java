package zhy2002.neutron.anz.loanapplication;

//[convention] Each ui node class has the suffix 'Node'.
//[convention] Each ui node field name does not have the suffix 'Node'.
//[convention] Nodes are initialized eagerly.
//[convention] Node classes are organised in packages according to their parent child relationship.
//[convention] All CommonXxxNode are abstract. You need to know who the parent is to be concrete.

import zhy2002.neutron.anz.loanapplication.annexe.AnnexeNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.BrokerDetailsNode;
import zhy2002.neutron.anz.loanapplication.detailedcomments.DetailedCommentsNode;
import zhy2002.neutron.anz.loanapplication.interviewdetails.InterviewDetailsNode;
import zhy2002.neutron.anz.loanapplication.lendername.LenderNameNode;
import zhy2002.neutron.anz.loanapplication.loandetail.LoanDetailNode;
import zhy2002.neutron.anz.loanapplication.loanpreferences.LoanPreferencesNode;
import zhy2002.neutron.anz.loanapplication.nonrealestates.NonRealEstatesNode;
import zhy2002.neutron.anz.loanapplication.otherexpenses.OtherExpensesNode;
import zhy2002.neutron.anz.loanapplication.otherliabilities.OtherLiabilitiesNode;
import zhy2002.neutron.anz.loanapplication.otherrelatedparties.OtherRelatedPartiesNode;
import zhy2002.neutron.anz.loanapplication.personapplicants.PersonApplicantsNode;
import zhy2002.neutron.anz.loanapplication.realestates.RealEstatesNode;
import zhy2002.neutron.anz.loanapplication.stateofpositions.StatementOfPositionsNode;
import zhy2002.neutron.uinode.CompositeUiNode;
import zhy2002.neutron.uinode.ParentUiNode;
import zhy2002.neutron.uinode.RootUiNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 22/10/2016.
 */
public class LoanApplicationNode extends CompositeUiNode<RootUiNode> {

    private LenderNameNode lenderName;
    private BrokerDetailsNode brokerDetails;
    private DetailedCommentsNode detailedComments;
    private PersonApplicantsNode personApplicants;
    private NonRealEstatesNode nonRealEstates;
    private RealEstatesNode realEstates;
    private OtherLiabilitiesNode otherLiabilities;
    private OtherExpensesNode otherExpenses;
    private OtherRelatedPartiesNode otherRelatedParties;
    private LoanDetailNode loanDetail;
    private AnnexeNode annexe;
    private StatementOfPositionsNode statementOfPositions;
    private LoanPreferencesNode loanPreferencesNode;
    private InterviewDetailsNode interviewDetails;

    protected LoanApplicationNode(RootUiNode parent) {
        super(parent);
    }

    protected LoanApplicationNode(UiNodeContext context) {
        super(context);
    }
}
