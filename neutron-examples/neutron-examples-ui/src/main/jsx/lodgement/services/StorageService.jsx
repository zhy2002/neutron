import axios from 'axios';
import moment from 'moment';
import CommonUtil from '../../neutron/CommonUtil';
import EventService from '../../neutron/EventService';
import StaticService from '../../neutron/StaticService';


const baseUrl = 'http://localhost:9200';

//todo move this to node property
const excludedNodeNames = ['addressRefListNode', 'errorListNode'];

const errorHandler = (error) => {
    console.log('An error occurred in Storage Service:', error);
    EventService.fire(
        {
            name: 'show_notification',
            delay: 100
        },
        {
            message: error.toString(),
            position: 'tc',
            level: 'error'
        }
    );
    return window.Promise.reject(error);
};

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

export default class StorageService extends StaticService {

    static extractApplicationValue(model) {
        return CommonUtil.extractValue(model, excludedNodeNames);
    }

    static saveApplication(model) {
        const now = moment().format();
        model.getDateUpdatedNode().setValue(now);
        const node = StorageService.extractApplicationValue(model);
        const id = node.children.id.value;
        const summary = getSummary(node, model);
        return axios.put(
            `${baseUrl}/lodgement/application/${id}`, summary
        ).then(
            response => CommonUtil.defer(response),
            errorHandler
        );
    }

    static getApplicationSummaries() {
        return axios.get(
            `${baseUrl}/lodgement/application/_search?q=*&_source_exclude=node&size=100&sort=updated:desc`
        ).then(
            response => response.data,
            errorHandler
        );
    }

    static getApplication(id) {
        return axios.get(
            `${baseUrl}/lodgement/application/${id}?pretty`
        ).then(
            response => response.data['_source'].node,
            errorHandler
        );
    }
}
