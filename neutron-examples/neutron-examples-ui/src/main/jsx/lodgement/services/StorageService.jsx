import axios from 'axios';
import moment from 'moment';
import CommonUtil from './CommonUtil';
import EventService from '../../bootstrap3/common/EventService';


const baseUrl = 'http://localhost:9200';

class StorageService {
}

const errorHandler = (error) => {
    CommonUtil.setIsLoading(false);
    setTimeout(() => {
        console.log(error);
        EventService.fire(
            'show_notification',
            {
                message: error.toString(),
                position: 'tc',
                level: 'error'
            }
        );
    }, 100);
    return window.Promise.reject(error);
};

StorageService.getApplicationSummaries = () => {
    CommonUtil.setIsLoading(true);
    return axios.get(
        `${baseUrl}/lodgement/application/_search?q=*&_source_exclude=node&size=100&sort=updated:desc`
    ).then(
        (response) => {
            CommonUtil.setIsLoading(false);
            return response.data;
        },
        errorHandler
    );
};

StorageService.getApplication = id =>
    axios.get(`${baseUrl}/lodgement/application/${id}?pretty`).then(
        response => response.data['_source'].node,
        errorHandler
    );

function getSummary(data, model) {
    const node = data.children;
    return {
        id: node.id.value,
        lender: node.lender.value,
        username: node.owningUser.value,
        applicants: model.getApplicants(),
        amount: model.getTotalLoanAmount(),
        status: node.status.value,
        created: node.dateCreated.value,
        updated: node.dateUpdated.value,
        lodged: node.dateLodged.value,
        node: data
    };
}

StorageService.saveApplication = (model) => {
    CommonUtil.setIsLoading(true);
    const now = moment().format();
    model.getDateUpdatedNode().setValue(now);
    const node = CommonUtil.extractValue(model);
    const id = node.children.id.value;
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
