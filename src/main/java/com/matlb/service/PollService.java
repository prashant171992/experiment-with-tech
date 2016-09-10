package com.matlb.service;

import com.matlb.domain.User;
import com.matlb.domain.requestDomain.AnswerQuestionRequest;
import com.matlb.domain.requestDomain.CreatePollRequest;
import com.matlb.domain.requestDomain.PollEnquiryRequest;
import com.matlb.domain.responseDomain.BasePollResponse;

/**
 * Created by prassingh on 8/21/16.
 */
public interface PollService {

    public BasePollResponse getPollsCreatedByUser(PollEnquiryRequest pollInquiryRequest , int pageNum);

    public BasePollResponse getPollAnsweredByUser(PollEnquiryRequest pollInquiryRequest, int pageNum);

    public BasePollResponse getPollAskedToByUser(User user , int pollId , int pageNum);

    public BasePollResponse getPollToBeShownByUser(User user , int pageNum , int openForAll);

    public BasePollResponse createPoll(CreatePollRequest createPollRequest);

    public BasePollResponse answerPollQuestion(AnswerQuestionRequest answerQuestionRequest);

}
