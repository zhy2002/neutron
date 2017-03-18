import axios from 'axios';
import moment from 'moment';
import CommonUtil from './CommonUtil';


const baseUrl = 'http://localhost:9200';

class StorageService {
}

const errorHandler = (error) => {
    CommonUtil.setIsLoading(false);
    console.log(error);
    setTimeout(() => {
        alert(error);
    }, 100);
    return window.Promise.reject(error);
};

StorageService.getApplicationSummaries = () => {
    CommonUtil.setIsLoading(true);
    return axios.get(
        `${baseUrl}/lodgement/application/_search?q=*&_source_exclude=node`
    ).then(
        (response) => {
            CommonUtil.setIsLoading(false);
            return response.data;
        },
        errorHandler
    );
};

StorageService.getApplication = id =>
    axios.get(`${baseUrl}/lodgement/application/${id}`).then(
        response => response.data['_source'].node,
        errorHandler
    );

function getSummary(node, model) {
    return {
        id: node.id,
        lender: node.lender,
        username: node.owningUser,
        applicants: model.getApplicants(),
        amount: model.getTotalLoanAmount(),
        status: node.status,
        created: node.dateCreated,
        updated: node.dateUpdated,
        lodged: node.dateLodged,
        node
    };
}

StorageService.saveApplication = (model) => {
    CommonUtil.setIsLoading(true);
    const now = moment().format();
    model.getDateUpdatedNode().setValue(now);
    const node = CommonUtil.extractValue(model);
    const id = node.id;
    const summary = getSummary(node, model);
    return axios.put(
        `${baseUrl}/lodgement/application/${id}`, summary
    ).then(
        (response) => {
            CommonUtil.setIsLoading(false);
            return CommonUtil.defer(response);
        },
        errorHandler
    );
};

export default StorageService;
