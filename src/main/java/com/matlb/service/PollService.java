package com.matlb.service;

import com.matlb.domain.User;
import com.matlb.domain.requestDomain.AnswerQuestionRequest;
import com.matlb.domain.requestDomain.CreatePollRequest;
import com.matlb.domain.requestDomain.PollEnquiryRequest;
import com.matlb.domain.requestDomain.ShowPollRequest;
import com.matlb.domain.responseDomain.BasePollResponse;

/**
 * Created by prassingh on 8/21/16.
 */
public interface PollService {

    public BasePollResponse getPollsCreatedByUser(PollEnquiryRequest pollInquiryRequest , int pageNum);

    public BasePollResponse getPollAnsweredByUser(PollEnquiryRequest pollInquiryRequest, int pageNum);

    public BasePollResponse getPollAskedToByUser(User user , Integer pollId , int pageNum);

    public BasePollResponse getPollToBeShownToUser(ShowPollRequest showPollRequest);

    public BasePollResponse createPoll(CreatePollRequest createPollRequest);

    public BasePollResponse answerPollQuestion(AnswerQuestionRequest answerQuestionRequest);

    public BasePollResponse updatePollStatus(User user, Integer pollId, int status);

    public BasePollResponse getPollDetailsById(User user, Integer pollId);

    public BasePollResponse getPollCategories(User user);

    public BasePollResponse reportPoll(User user, Integer pollId);

    public BasePollResponse getPollAskedDetailsById(User user, Integer pollId);

}
